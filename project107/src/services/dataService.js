// products into the Catalog
const catalog = [
    {
        "title":"Orange",
        "category":"fruit",
        "price":15.99,
        "image":"orange.jpg",
        "_id":"1"//Unique
    },
    {
        "title":"Apple",
        "category":"fruit",
        "price":20.99,
        "image":"apple.png",
        "_id":"2"//Unique
    },
    {
        "title":"Strawberries",
        "category":"berry",
        "price":15.99,
        "image":"strawberries.png",
        "_id":"3"//Unique
    }
];

class DataService {
    getProducts(){
        return catalog;
    }
}

export default DataService;