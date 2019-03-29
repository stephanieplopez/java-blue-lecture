const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerHTML = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerHTML = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

/**
 * Displays a review that has just been saved
 * @param {Object} review The review to display
 */
function displayReview(review) {
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerHTML = review.reviewer;
  tmpl.querySelector('h3').innerHTML = review.title;
  tmpl.querySelector('p').innerHTML = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();
    tmpl.querySelector('.rating').appendChild(img);
  }
  main.appendChild(tmpl);
}

// LECTURE STARTS HERE ---------------------------------------------------------------


<<<<<<< HEAD
// 1. We are adding an eventListener above the root
// 2. (what we care about (eventType), how the event is going to be handled(eventHandler))
// -> Need a function to call back
// 3. Building the handler
// 4. Moved the functions into the handler
=======
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
document.addEventListener('DOMContentLoaded', () => {
  // set the product reviews page title
  setPageTitle();
  // set the product reviews page description
  setPageDescription();
  // display all of the product reviews on our page
  displayReviews();

<<<<<<< HEAD
  // 5. Create reference to tag
  const desc = document.querySelector('.description');
  // 6. Once we have the node referenced, we can 'select' it
  // 7. Now we create eventHandler
  desc.addEventListener('click', (event) => {
    // 8. We pass it our reference of event and call the .target (what has just happened)
    toggleDescriptionEdit(event.target);
    // 9. We need to create two 'escape' conditions 
    // 10. First we find out reference by checking DOM of page
  });

  const inputDesc = document.getElementById('inputDesc');
  // 11. Figure out what event to add. We use keyup because we want to know when the key is 'released'
  inputDesc.addEventListener('keyup', (event) => {
    //12. If statement to check if key has been pressed down and released
    if (event.key === 'Enter') {
      // 13. Call function to set event.target to true (save) when Enter is released (contains node that was 'affected')
      exitDescriptionEdit(event.target, true);
    }
    if (event.key === 'Escape') {
      // 14. Call function to set event.target to false, not save when Escape is released
      exitDescriptionEdit(event.target, false);
    }
  });  

  // 15. Add another eventListener for when the mouse moves from textarea, it 'deactivates the textbox'
  inputDesc.addEventListener('mouseleave', (e) => {
    exitDescriptionEdit(e.target, false);
  });
  
  //16. Create reference for button add review (btnToggleForm)
  const btnToggleForm = document.getElementById('btnToggleForm');
  //17. We don't need an event argument, because of how the DOM is written
=======
  const desc = document.querySelector('.description');
  desc.addEventListener('click', (event) => {
    toggleDescriptionEdit(event.target);
  });

  const inputDesc = document.getElementById('inputDesc');
  inputDesc.addEventListener('keyup', (event) => {
    if (event.key === 'Enter') {
      exitDescriptionEdit(event.target, true);
    }
    if (event.key === 'Escape') {
      exitDescriptionEdit(event.target, false);
    }
  });

  inputDesc.addEventListener('mouseleave', (e) => {
    exitDescriptionEdit(e.target, false);
  });

  const btnToggleForm = document.getElementById('btnToggleForm');
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
  btnToggleForm.addEventListener('click', () => {
    showHideForm();
  });

<<<<<<< HEAD
  // 18. Create reference for button save review (btnSaveReview)
  const btnSaveReview = document.getElementById('btnSaveReview');
  // 19. Now we create eventHandler
  btnSaveReview.addEventListener('click', (event) => {
  // 20. We are going to prevent it's default action from happening
    event.preventDefault(); // Stop a controls default action
  // Stops the capture/bubble event propagation -- Wherever we are in the process
  //event.stopPropagation();
    // 25. Review is saved 
=======
  const btnSaveReview = document.getElementById('btnSaveReview');
  btnSaveReview.addEventListener('click', (event) => {
    event.preventDefault();  // Stop a controls default action
    //event.stopPropagation();  // Stops the capture/bubble event propagation
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
    saveReview();
  });

});

/**
 * Take an event on the description and swap out the description for a text box.
 *
 * @param {Event} event the event object
 */
function toggleDescriptionEdit(desc) {
  const textBox = desc.nextElementSibling;
  textBox.value = description;
  // Removes the CSS class applied
  textBox.classList.remove('d-none');
  // Adds the CSS class to desc (the paragraph)
  desc.classList.add('d-none');
  // Allows for object to be accessible to the User
  textBox.focus();
}

/**
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event} event the event object
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {
  let desc = textBox.previousElementSibling;
  if (save) {
    desc.innerText = textBox.value;
  }
  textBox.classList.add('d-none');
  desc.classList.remove('d-none');
}

/**
 * I will show / hide the add review form
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  // If statement to check if user can or can't see the form
  if (form.classList.contains('d-none')) {
    // Shows form to user
    form.classList.remove('d-none');
    // Changes text on button
    btn.innerText = 'Hide Form';
    // Puts the cursor to the name textbox using focus
    document.getElementById('name').focus();
  } else {
    // Clears the text in the form
    resetFormValues();
    form.classList.add('d-none');
    btn.innerText = 'Add Review';
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {
  const form = document.querySelector('form');
  const inputs = form.querySelectorAll('input');
  inputs.forEach((input) => {
    input.value = '';
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * I will save the review that was added using the add review from
 * Build the review, save the review
 */
function saveReview() {
<<<<<<< HEAD
  // 21. Check the IDs for the form and create their references so we can access them
=======
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
  const name = document.getElementById('name');
  const title = document.getElementById('title');
  const rating = document.getElementById('rating');
  const review = document.getElementById('review');

<<<<<<< HEAD
  // 22. Build a new object definition for a newReview
  // 23. On form fields we get values, so when the user has typed in values into the form, using the
  // --  key values pairs to access the review
  const newReview = {
  reviewer: name.value,
  title: title.value,
  review: review.value,
  rating: rating.value,
  }
  // 24. Store object created in array
=======
  const newReview =  {
    reviewer: name.value,
    title: title.value,
    review: review.value,
    rating: rating.value
  }
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
  reviews.push(newReview);
  displayReview(newReview);
  showHideForm();
}
