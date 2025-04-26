function validateLoginForm() {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    let valid = true;

    // Clear previous error messages
    clearErrors();

    // Validate email
    if (!email) {
        showError('email', 'El correo electrónico es obligatorio.');
        valid = false;
    } else if (!validateEmail(email)) {
        showError('email', 'Por favor, ingresa un correo electrónico válido.');
        valid = false;
    }

    // Validate password
    if (!password) {
        showError('password', 'La contraseña es obligatoria.');
        valid = false;
    } else if (password.length < 6) {
        showError('password', 'La contraseña debe tener al menos 6 caracteres.');
        valid = false;
    }

    return valid;
}

function validateEmail(email) {
    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return re.test(String(email).toLowerCase());
}

function showError(fieldId, message) {
    const field = document.getElementById(fieldId);
    const error = document.createElement('div');
    error.className = 'text-danger';
    error.innerText = message;
    field.parentNode.insertBefore(error, field.nextSibling);
}

function clearErrors() {
    const errors = document.querySelectorAll('.text-danger');
    errors.forEach(error => error.remove());
}

// Attach validation to the login form submission
document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('form');
    if (form) {
        form.addEventListener('submit', (event) => {
            if (!validateLoginForm()) {
                event.preventDefault();
            }
        });
    }
});