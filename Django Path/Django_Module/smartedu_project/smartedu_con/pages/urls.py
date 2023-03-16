from django.urls import path
from pages.views import AboutView, IndexView, ContactView

#========
# Function-based View layer
#========
#urlpatterns = [
#    path('', views.index, name="index"),
#    path('about/', views.about, name="about"),
#]

#========
# Class-based View layer
#========
urlpatterns = [
    path('', IndexView.as_view(), name="index"),
    path('about/', AboutView.as_view(), name="about"),
    path('contact/', ContactView.as_view(), name="contact"),
]

