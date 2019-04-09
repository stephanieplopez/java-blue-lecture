let reviews = [];

// 2. Variable to hold button
const button = document.querySelector("button");
// 3. Add an event listener to listen to click event
button.addEventListener("click", () => {
    loadReviews();
    // 4. Disable button -- (We could add CSS for it to appear disabled)
    button.disabled = true;
})

// 1. Create function to hold event
function loadReviews() {
    // (...) signifies in the console log that Load Reviews actually occured
    console.log("Load Reviews...");

    // 5. Fetch data and reponse
    fetch('data.json')
        .then( (response) => {
            return response.json();
        })
        .then( ( data) => {
            // 6. We need to put data into reviews
            reviews = data;
            // Testing line....
            console.table(reviews);
            displayReviews();
        })
        .catch( err => console.error(err));
}

// 7. DOM manipulation
function displayReviews() {
    // This line is something we add in to troubleshoot our function -- later Brian stated he would remove this
    console.log("Display Reviews...");
   
    // 8. IF -First thing we always do here is check to see if browser can use a template by checking for content
    if ('content' in document.createElement('template')) {
   
        // IF TRUE - query the document for .reviews and assign to a variable named container
        const reviewsDiv = document.querySelector('.reviews');
   
        // Loop over the array of reviews
        reviews.forEach( (review) => {
   
            // Get the template using id review-template
            // Clone the template and store in a variable
   
            const tmpl = document.getElementById('review-template').content.cloneNode(true);
   
            // Find all the elements in the template and populate from Review (look at data object)
            tmpl.querySelector('img').setAttribute('src', review.avatar);
            tmpl.querySelector('.username').innerText = review.username;
            tmpl.querySelector('h2').innerText = review.title;
            tmpl.querySelector('.published-date').innerText = review.publishedOn;
            tmpl.querySelector('.user-review').innerText = review.review;

            // append the template to the DOM -- (Code that will be populated, but not displayed yet. Later we make a copy of this original)
            reviewsDiv.appendChild(tmpl);
        });
    
    } else {
    // else - log an error if the browser cannot use a template
        console.error('Your browser does not support templates');
    }
}
