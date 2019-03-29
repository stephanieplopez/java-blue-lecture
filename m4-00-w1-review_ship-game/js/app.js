/*
* Add Events and functions to move the Ship and Win the game
*/
<<<<<<< HEAD

// 1. Create Dom and put createGrid inside of it 
document.addEventListener('DOMContentLoaded', () => {
    // Creates the Grid -- this should only occur after the DOM loads
    // 2. Creating the Grid is required to do first
    createGrid();
    // 12. We are delegating the event
    // -- We look up keys (left,right,up,down etc) for javascript
    document.querySelector('body').addEventListener('keyup', (event) => {
        if (event.key === 'ArrowRight') {
            moveShipRight();
        }
        if (event.key === 'ArrowLeft') {
            moveShipLeft();
        }
        if (event.key === 'ArrowDown') {
            moveShipDown();
        }
        if (event.key === 'ArrowUp') {
            moveShipUp();
        }

    })
});

function moveShipUp() {
    const ship = getShipLocation();
    const up = getUpperOrLowerElementAtIndex(ship, ship.parentElement.previousElementSibling);
    moveShip(ship, up);
}

function moveShipDown() {
    const ship = getShipLocation();
    const down = getUpperOrLowerElementAtIndex(ship, ship.parentElement.nextElementSibling);

    moveShip(ship, down);

}

function moveShipLeft() {
    const ship = getShipLocation();
    const left = ship.previousElementSibling;

    moveShip(ship, left);
}
    
function moveShipRight() {
    // 14. stores where the shop is located
    const ship = getShipLocation();
    const right = ship.nextElementSibling;
    
    moveShip(ship, right);
}

// 17. Built a function that prevents boat from moving off the screen
function moveShip(shipElement, newElement) {
    if (canMoveTo(shipElement, newElement)) {
        shipElement.classList.remove('boat');
        newElement.classList.add('boat');
    }
}

function canMoveTo(shipElement, newElement) {
    if (newElement == null || newElement.classList.contains('pirate')) {
        return false;
    }
    if (isWin(newElement)) {
        win();
        return false;
    }
    return true;
}

function win() {
    // Query Selector requires a .
    const winText = document.querySelector('.announce');
    winText.classList.add('winText');
    winText.innerText = "You Win Mate!!!";
    getShipLocation().classList.remove('boat');
}


function isWin(nextElement) {
    if(nextElement.classList.contains('treasure')) {
        return true;
    }
    return false;
}

// 13. Build a function that can return the player's ships location
function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');
=======
// Creates the Grid -- this should only occur after the DOM loads
document.addEventListener('DOMContentLoaded', () => {
    createGrid();
    document.querySelector('body').addEventListener('keyup', (event) => {
        if (event.key === 'ArrowRight') {
            moveShipRight();
        }    
        if (event.key === 'ArrowLeft') {
            moveShipLeft();
        }
        if (event.key === 'ArrowDown') {
            moveShipDown();
        }
        if (event.key === 'ArrowUp') {
            moveShipUp();
        }
    });
});

function moveShipUp() {
    const ship = getShipLocation();
    const up = getUpperOrLowerElementAtIndex(ship, ship.parentElement.previousElementSibling);
    moveShip(ship, up);
}

function moveShipDown() {
    const ship = getShipLocation();
    const down = getUpperOrLowerElementAtIndex(ship, ship.parentElement.nextElementSibling);

    moveShip(ship, down); 
}

function moveShipLeft() {
    const ship = getShipLocation();
    const left = ship.previousElementSibling;
    
    moveShip(ship, left);  
}

function moveShipRight() {
    const ship = getShipLocation();
    const right = ship.nextElementSibling;

    moveShip(ship, right);  
}

function moveShip(shipElement, newElement) {
    if (canMoveTo(shipElement, newElement)) {
        shipElement.classList.remove('boat');
        newElement.classList.add('boat');  
    }
}

function canMoveTo(shipElement, newElement) {
    if (newElement == null || newElement.classList.contains('pirate')) {
        return false;
    }
    if (isWin(newElement)) {
        win();
        return false;
    }
    return true;
}

function isWin(nextElement) {
    if (nextElement.classList.contains('treasure')) {
        return true;
    }
    return false;
}

function win() {
    const winText = document.querySelector('.announce');
    winText.classList.add('winText');
    winText.innerText = "You Win!";
    getShipLocation().classList.remove('boat');
}

function getShipLocation() {
    return document.getElementById('frame').querySelector('.boat');
}

function getUpperOrLowerElementAtIndex(ship, newRow) {
    let elementAtIndex = null;
    if (newRow != null) {
        const index = getIndexOfElement(ship);
        elementAtIndex = newRow.childNodes[index];
    }
    return elementAtIndex;
}

function getIndexOfElement(element) {
    return Array.from(element.parentNode.children).indexOf(element);
}

/**
 * Reset the Game
 */
function resetGame() {
    const frame  = document.getElementById('frame');
    frame.firstElementChild.firstElementChild.classList.add('boat');
    frame.lastElementChild.lastElementChild.classList.add('treasure');
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
}

// 18. Pass it the row we want to be in
function getUpperOrLowerElementAtIndex(ship, newRow) {
    let elementAtIndex = null;
    if (newRow != null) {
        const index = getIndexOfElement(ship);
        elementAtIndex = newRow.childNodes[index];
    }
    return elementAtIndex;
}

// 15. Created a function to get the index of the element
function getIndexOfElement(element) {
    return Array.from(element.parentNode.children).indexOf(element);
}
    
/**
* Reset the Game
 */
<<<<<<< HEAD
    
function resetGame() {
    const frame = document.getElementById('frame');
    // 10. Putting the player in place -- we first select the row, then the 
    // div, change it's class list        
    frame.firstElementChild.firstElementChild.classList.add('boat');
    // 11. Pull the last row and last element
    frame.lastElementChild.lastElementChild.classList.add('treasure');
}
    
/**
* Creates the game grid
*/

function createGrid() {
    // 3. Create a reference to frame 
=======
function createGrid() {
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
    const frame = document.getElementById('frame');
    // Add Code to create the game grid
    for (let i = 0; i < 10 ; i++) {
        buildRow(frame);
    }
    resetGame();
}

/**
* Builds the grid rows
* @param {element} frame
*/
    
function buildRow(frame) {
<<<<<<< HEAD
   // 4. Add code to create rows (build for each time a row is created, add div)
    const row = document.createElement('div');
    // 5. Add our class that hasn't been attached to the class yet
    // -- Will add CSS 
    row.classList.add('row');
    // 6. Attach row to the frame (before the end, and attach the row)
    frame.insertAdjacentElement('beforeend', row);
    // Builds rows 10 times
=======
   // Add code to create rows
   const row = document.createElement('div');
   row.classList.add('row');
   frame.insertAdjacentElement('beforeend', row);
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
    for (let i = 0; i < 10 ; i++) {
        // It's used to make sure there isn't one on the starting point
        buildSquare(row, i);
    }
}
    
/**
* Builds the grid squares
* @param {element} row
* @param {int} count
*/
    
function buildSquare(row, count) {
<<<<<<< HEAD
   // 7. Add code to create the grid Squares
    const container = document.createElement('div');
    container.classList.add('square');
    
    // Randomly creates pirates, but not on the first element
    if (count > 0 && count < 9) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // 8. Add the pirates here
            container.classList.add('pirate');
        }
    }
    row.insertAdjacentElement('beforeend', container)
}
=======
   // Add code to create the grid Squares
    const container = document.createElement('div');
    container.classList.add('square');

    // Randomly creates pirates, but not on the first elemment
    if (count > 1) {
        if ((Math.floor(Math.random() * 100) + 1) > 85) {
            // Add the pirates here
            container.classList.add('pirate');
        } 
    }
    row.insertAdjacentElement('beforeend', container);
}



>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
