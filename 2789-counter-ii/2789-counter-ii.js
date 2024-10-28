/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let temp=init;
    let object={
        increment:function(){
            return temp+=1;
        },
        decrement: function(){
            return temp-=1;
        },
        reset:function(){
            return temp=init;
        }
    }
    return object;
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */