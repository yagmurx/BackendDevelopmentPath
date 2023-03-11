from django.urls import path
from . import views

urlpatterns = [
    #path(route, view, opt(shortcut name))
    path('', views.index, name="index"),
    path('about/', views.about, name="about"),
]
