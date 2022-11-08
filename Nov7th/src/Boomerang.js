function countBoomerangs(input){
    return input.reduce((p,c,i,a)=>
    p+Number(a[i-1]!=c&&a[i-1]==a[i+1])
    ,0);
}
console.log(countBoomerangs([3,7,3,2,1,5,1,2,2,-2,2]))
console.log(countBoomerangs([1, 7, 1, 7, 1, 7, 1]))
console.log(countBoomerangs([9, 5, 9, 5, 1, 1, 1]))
console.log(countBoomerangs([5, 6, 6, 7, 6, 3, 9]))
console.log(countBoomerangs([4, 4, 4, 9, 9, 9, 9]))