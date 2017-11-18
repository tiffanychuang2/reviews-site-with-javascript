let links = document.querySelectorAll('a');
for(let i=0; i<links.length; i++) {
	links[i].addEventListener('mouseover', function() {
		this.style.fontSize = '200%';
	});
	}
