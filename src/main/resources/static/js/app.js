 let links = document.querySelectorAll('a');
 for(let i=0; i<links.length; i++) {
 	links[i].addEventListener('mouseover', function() {
 		this.style.fontSize = '120%';
 	});
 	links[i].addEventListener('mouseout', function() {
 		this.style.fontSize = '22px';
 	});
 }
var commentCounter = 0;
var comment = document.getElementById('.comment-button');

//*********************************************************************//
//Since we start w/o comments, remove the border around the comment div
//*********************************************************************//
// function displayBoxAroundComments() {
//   	if (commentsExist == null) {
// 		document.querySelector(".user-comments").style.border = "none";
// 	} else {
// 		document.querySelector(".user-comments").style.border = "1px dotted grey";
// 	}
// }

comment.addEventListener('click', function() {

	commentCounter = commentCounter + 1;

	var enterComment = prompt('Share your thoughts:');

	if (enterComment == null || enterComment == "") {
	} else {

		var commentText = document.createElement("p");
		commentText.className = 'commentNbr' + commentCounter;

		var displayComment = document.createTextNode(enterComment);
		commentText.appendChild(displayComment);

		var deleteButton = document.createElement("button");
		deleteButton.className = 'commentNbr' + commentCounter;
		deleteButton.id = commentCounter;

		deleteButton.addEventListener('click', function() {
			var confirmDelete = prompt('Enter YES to confirm delete');
			if (confirmDelete == "YES" || confirmDelete == "yes" || confirmDelete == "Yes") {
				var idNumber = this.id;
				var idNumberToDelete = 'commentDiv' + idName;
				var commentToDelete = document.getElementById(idNumberToDelete);
				commentToDelete.parentNode.removeChild(commentToDelete);
				// displayBoxAroundComments();
			} else {
				alert("Comment will not be deleted.");
			}
		});

		var deleteButtonText = document.createTextNode("delete");
		deleteButton.appendChild(deleteButtonText);

		var div = document.createElement("div");
		var specificClass = 'commentCounter' + commentCounter;
		div.classList.add(specificClass, "aComment");
		div.id = 'commentDiv' + commentCounter;

		var element = document.getElementById("comments");
		element.appendChild(div);
		div.appendChild(deleteButton);
		div.appendChild(commentText);
	}
	// displayBoxAroundComments();
});