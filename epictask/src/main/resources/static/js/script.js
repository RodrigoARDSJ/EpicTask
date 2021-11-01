const password = document.querySelector('.fas');
const passField = document.querySelector('#password');
password.onclick = (() => {
	if (passField.type === 'text') {
		passField.type = "password";
		password.classList.remove('fa-eye-slash');
	} else {
		passField.type = "text";
		password.classList.add('fa-eye-slash');
	}

})

