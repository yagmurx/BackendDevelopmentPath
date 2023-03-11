from django.shortcuts import render

def index(request):
    return render(request, 'index.html')

# view about
def about(request):
    return render(request, 'about.html')