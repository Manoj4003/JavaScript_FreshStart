// ------------------------------
// 1. Basic for loop using i
// ------------------------------
for (let i = 0; i < 5; i++) {
    console.log("Basic for loop i =", i);
}

// ------------------------------
// 2. Array Iteration using i
// ------------------------------
let numbers = [10, 20, 30];
for (let i = 0; i < numbers.length; i++) {
    console.log("Array value =", numbers[i]);
}

// ------------------------------
// 3. While loop using i
// ------------------------------
let i = 1;
while (i <= 5) {
    console.log("While loop i =", i);
    i++;
}

// ------------------------------
// 4. i used in condition
// ------------------------------
i = 10;
if (i > 5) {
    console.log("i is greater than 5");
}

// ------------------------------
// 5. i used inside a function
// ------------------------------
function multiply(i) {
    return i * 2;
}
console.log("multiply(5) =", multiply(5));

// ------------------------------
// 6. Nested loops using i and j
// ------------------------------
for (let i = 1; i <= 3; i++) {
    for (let j = 1; j <= 2; j++) {
        console.log("Nested Loop: i =", i, ", j =", j);
    }
}

// ------------------------------
// 7. Increment and decrement
// ------------------------------
i = 5;
i++;
console.log("After i++ =", i);

i--;
console.log("After i-- =", i);
