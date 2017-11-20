 let links = document.querySelectorAll('a');
 for(let i=0; i<links.length; i++) {
 	links[i].addEventListener('mouseover', function() {
 		this.style.fontSize = '120%';
 	});
 	links[i].addEventListener('mouseout', function() {
 		this.style.fontSize = '22px';
 	});
 }
 
 let captions = document.querySelectorAll('figcaption');
 for(let i=0; i<captions.length; i++) {
 	captions[i].addEventListener('mouseover', function() {
 		this.style.fontSize = '120%';
 	});
 	captions[i].addEventListener('mouseout', function() {
 		this.style.fontSize = '22px';
 	});
 }

 let copyright = document.querySelectorAll('#copyright');
 for(let i=0; i<copyright.length; i++) {
 	copyright[i].addEventListener('mouseover', function() {
 		this.innerText = 'Created By Tiffany Chuang';
 	});
 	copyright[i].addEventListener('mouseout', function() {
 		this.innerText = '© 2017';
 	});
 } 
 
// comment section
 let submitComment = document.querySelector('.submit-comment');
 submitComment.addEventListener('click', function() {
 		let userInput = prompt('Share your thoughts:');
 		let commentCounter = 0;
 		commentCounter = commentCounter + 1;
 		
 		if(userInput == null || userInput == "") {
 		} else {
 			
 			let text = document.createElement("p");
 			text.className = 'commentCounter' + commentCounter;

 			let box = document.createTextNode(userInput);
 			text.appendChild(box);

 			let deleteButton = document.createElement("button");
 			deleteButton.className = 'commentCounter' + commentCounter;
 			deleteButton.id = commentCounter;

 			deleteButton.addEventListener('click', function() {
 				let confirmDelete = prompt('Delete this comment?  Enter Y to confirm.');
 				if(confirmDelete == "Y" || confirmDelete =="y") {
 					this.parentNode.remove();
 				} else {
 					alert("Comment will not be deleted.");
 				}
 			});

 			let box2 = document.createTextNode("x");
 			deleteButton.appendChild(box2);

 			let div = document.createElement("div");
 			let nameClass = 'commentCounter' + commentCounter;
 			div.classList.add(nameClass, "aComment");
 			div.id = 'commentCounter' + commentCounter;

 			let commentSection = document.getElementById("comments");
 			commentSection.appendChild(div);
 			div.appendChild(deleteButton);
 			div.appendChild(text);
 		}
 });

//  //delete genre confirm

// let deleteGenre = document.getElementById('delete-genre');

// deleteGenre.addEventListener('click', function() {
// 			let confirmDelete = prompt('Delete this genre?  Enter Y to confirm.');
// 			if(confirmDelete == "Y" || confirmDelete =="y") {
// 				this.parentNode.remove();
// 			} else {
// 				alert("Comment will not be deleted.");
// 			}
// });

let deleteGenre = document.querySelectorAll('#delete-genre');
for (let i = 0; i < deleteGenre.length; i++) {
deleteGenre[i].addEventListener('click', function(event) {
    if (!confirm('Remove this genre?')) {
        event.preventDefault();
    }
});
}



 


 
 


