function doesTriangleFit(triangle,triangularHole){
    result = 1;
    result *= triangle[2]<triangle[0]+triangle[1];
    result *= triangularHole[2]<triangularHole[0]+triangularHole[1];
    result *= triangle[0]<=triangularHole[0] && triangle[0]<=triangularHole[1] && triangle[0]<=triangularHole[2];
    result *= triangle[1]<=triangularHole[1] && triangle[1]<=triangularHole[2];
    result *= triangle[2]<=triangularHole[2];
    return Boolean(result);
}

console.log(doesTriangleFit([1,1,1],[1,1,1])) // true
console.log(doesTriangleFit([1,1,1],[2,2,2])) // true
console.log(doesTriangleFit([1,2,3],[1,2,2])) // false
console.log(doesTriangleFit([1,2,4],[1,2,6])) // false