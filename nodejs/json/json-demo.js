// js 对象

const person = {
    name: 'John',
    age: 30,
    isStudent: false,
    address: {
        city: 'New York',
        zip: '10001'
    },
    sayHello: function (){
        console.log('Hello!')
    }
}

// js → JSON
const jsonString = JSON.stringify(person)
console.log(jsonString)

// JSON → js
const parseObject = JSON.parse(jsonString);
console.log(parseObject)
