function isPalindrome(str) {
    const rev = str.split("").reverse().join("");
    return rev === str;
}

console.log(isPalindrome("madam")); // true
console.log(isPalindrome("manoj")); // false
