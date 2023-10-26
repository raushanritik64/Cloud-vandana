// 2 JavaScript 
// A. Take a sentence as an input and reverse every word in that sentence. 
// a. Example - This is a sunny day > shiT si a ynnus yad

function wordReverse(sentence) {
    let words = sentence.split(' ');

    let wordReverse = words.map(word => {
        return word.split('').reverse().join('');
    });

    let sentenceReverse = wordReverse.join(' ');

    return sentenceReverse;
}

let Sentence = "This is a sunny day";
let sentenceReverse = wordReverse(Sentence);
console.log(sentenceReverse);