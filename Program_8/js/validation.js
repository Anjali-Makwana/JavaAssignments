function validateForm() {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const passwordRegex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

    if (!emailRegex.test(email)) {
        alert('Invalid email format');
        return false;
    }

    if (!passwordRegex.test(password)) {
        alert('Invalid password format. It must contain at least one lowercase letter, one uppercase letter, one digit, and one special character.');
        return false;
    }

    return true;
}
