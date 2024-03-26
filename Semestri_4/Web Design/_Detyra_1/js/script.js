
const navbarToggle = document.getElementById('navbarToggle');
const navbarDefault = document.getElementById('navbar-default');

navbarToggle.addEventListener('click', function () {
    navbarDefault.classList.toggle('hidden');
});