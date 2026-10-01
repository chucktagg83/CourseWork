from django.shortcuts import render    
from .forms import ContactForm
from django.core.mail import send_mail

# Create your views here.
def about_view(request):
    return render(request, 'pages/about.html')

def home_view(request):
    return render(request, 'pages/home.html')

def contact_view(request):
    form = ContactForm()
    if request.method == 'POST':
        form = ContactForm(request.POST)
        if form.is_valid():
            # Process the form data
            name = form.cleaned_data['name']
            email = form.cleaned_data['email']
            message = form.cleaned_data['message']
            
            message_body = (
                f'You have a new email from your portfolio contact form.\n\n'
                f'Name: {name}\n'
                f'Email: {email}\n\n'
                f'MESSAGE:\n{message}'
            )
            try:
                # send the email using Django's send_mail function
                send_mail(
                    "Email form Portfolio Contact Form", # Subject
                    message_body, # Message
                    email, # From email user's email
                    ['charles.w.taggart@gmail.com'], # To email (use your email)
                )
                # after sending the email, you can redirect to a success page or render a success message
                form = ContactForm()
                return render(request, 'pages/contact.html', {'form': form})
            except Exception as e:
                # Handle any errors that occur during email sending
                print(f"Error sending email: {e}")
                
                return render(request, 'pages/contact.html', {
                    'form': form,
                    'error': True
                })
        else:
            print("Form is not valid")
            return render(request, 'pages/contact.html', {'form': form})
    else:
        form = ContactForm()
        return render(request, 'pages/contact.html', {'form': form})


def projects_view(request):
    return render(request, 'pages/projects_list.html')

def experience_view(request):
    return render(request, 'pages/experience.html') 





