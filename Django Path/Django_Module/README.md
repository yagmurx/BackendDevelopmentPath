# Django Module

I have developed backend of the SmartEDU Project during this module. SmartEDU is a MOOC like Udemy.


# Course Module Notes
[01 - Creating Workspace](#01---creating-workspace)
[02 - Starting Server](#02---starting-server)
[03 - Django Folder Structure](#03---django-folder-structure)
[04 - Template Layer](#04---template-layer)
[05 - Migrations](#05---migrations)

## 01 - Creating Workspace
cmd
```
python -m venv env          // creates an environment named 'env'
env\Scripts\activate        // activating environment
pip install Django          // installing Django to workspace
django-admin startproject smartedu // creating a Django Project

//rename upper folder name as smartedu_con
```
## 02 - Starting Server
cmd
```
cd smartedu_con             // change directory, current directory must be contains 'manage.py'
python manage.py runserver  // starting server
```

## 03 - Django Folder Structure
![Django Folder Structure Diagram](https://studygyaan.com/wp-content/uploads/2019/07/Best-Practice-to-Structure-Django-Project-Directories-and-Files.png)

### 03a - Creating an App
1. cmd
```
python manage.py startapp pages     //It creates a new folder named 'pages'
```
2. go smartedu -> settings.py 
3. find and save the app to
   ```
         INSTALLED_APPS = [ ...
                            ...
                            ...
                            'pages.apps.PageConfig',
                            ]
    ```
4. go smartedu -> urls.py
5. adding url path
   ```
    from django.urls import path, include

    urlpatterns = [
        path('admin/', admin.site.urls),
        path('', include(pages.urls)), 
    ]
   ```
6. go pages -> views.py
7. adding a view
   ```
   from django.shortcuts import render

   def index(request):
        return render(request, 'index.html')

   ```
8. go pages -> urls.py
9.  adding the url path
   ```
   from django.urls import path
   from . import views

   urlpatterns = [
                  path('', views.index, name='index'),
   ]
   ```

## 04 - Template Layer
### 04a - Creating the templates folder
1. Create 'templates' sub-folder inside smartedu_con
2. Move index.html file (and other html files)
3. go smartedu -> settings.py
4. Change Templates directory
   ```
   import os

   TEMPLATES = [    'BACKEND': ...
                    'DIRS': [os.path.join(BASAE_DIR, 'templates)]
                    ...
                    ...
   ]
   ```

## 04b - Creating the static folder
1. Create 'static' sub-folder inside smartedu_con
2. Move all css files to static folder
3. go smartedu -> settings.py
4. Change Static directory
   ```
      STATIC_URL = '/static/'
      STATICFILES_DIRS = [os.path.join(BASE_DIR, 'static') ]
   ```
*NOTE* You must add all  {% load static %} tag to templates files for reaching that static files 
*EX* href="{% static 'images/favicon.ico' %}"

## 04c - Partials
Partials are created by making separate files into sections such as the header or footer that repeat on each page. This method is used to keep the sections the same on every page.
1. Create 'partials' sub-folder inside smartedu_con
2. Create '_base.html' that contains all common sections (out off homepage sections such as slider, testimonials, pricing)
3. Go index.html -> cut all common sections -> paste _base.html
4. Add authentic content tags to _base.html between <header> and <footer>
   ```
   {% load static %}                      // loading static files

   <!-- End header -->

   {% block content %}
   {% endblock %}

   <!-- Start footer -->
   ``` 
5. Add authentic content tags to index.html 
   ```
   {% extends 'partials/_base.html' %}    // add this tag top of the index.html
   {% load static %}                      // loading static files

   {% block content %}                    // begginging of code

   {% endblock %}                         // end of code                    
   ```
*NOTE* You can turn all sections to separate files with this method (footer, navbar etc.)
## 05 - Migrations
### 05a - Creating data tables
cmd
```
python manage.py migrate
```

### 05b - Creating an admin

cmd
```
python manage.py createsuperuser
```
### 05c - Creating a module
1. go -> models.py
2. create your class object REF: [Models Documentation](https://docs.djangoproject.com/en/4.1/topics/db/models/)
3. Apply migration
   ```
   python manage.py makemigrations
   python manage.py migrate
   ```
4. Add the model to admin panel
   ```
   from . models import Course

   admin.site.register(Course)
   ```

### Creating a folder for media files
1. Install pillow library
   ```
   python -m pip install Pillow
   ```
2. smartedu -> settings.py 
3. add the media directory end of file.
   ```
   # MEDIA FILES
   MEDIA_URL = '/media/'
   MEDIA_ROOT = [os.path.join(BASE_DIR, 'media')]
   ``` 
4. smartedu -> urls.py
5. add the media url
   ```
   from django.conf import settings 
   from django.conf.urls.static import static

   urlpatterns = [

   ] + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
   ```

   ### 05d - Admin Console Customization
   courses -> admin.py
   ```
   @admin.register(Course)
   class CourseAdmin(admin.ModelAdmin):
      list_display = ('name', 'available')
      list_filter = ('available',)
      search_fields = ('name', 'description')
   ```
