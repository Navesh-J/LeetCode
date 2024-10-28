/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    let object={
        toBe:function(args){
            if(args===val)
            return true;
            throw new Error("Not Equal")
        },
        notToBe:function(args){
            if(args===val)
            throw new Error("Equal")
            return true
        }
    }
    return object;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */