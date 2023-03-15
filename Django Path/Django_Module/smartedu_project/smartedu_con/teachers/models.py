from django.db import models

class Teacher(models.Model):
    name = models.CharField(max_length=50)
    title = models.CharField(max_length=50)
    description = models.TextField(blank=True, null=True)
    image = models.ImageField(upload_to="teachers/%Y/%m/%d/", default="teachers/default_teacher_image.jpg")
    facebook = models.URLField(max_length=200, blank=True)
    twitter = models.URLField(max_length=200, blank=True)
    linkedin = models.URLField(max_length=200, blank=True)
    youtube = models.URLField(max_length=200, blank=True)

    def __str__(self):
        return self.name