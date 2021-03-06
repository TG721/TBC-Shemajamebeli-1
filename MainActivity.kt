
class MathFunctions(){

    fun  largestCommonDivider(x: Int, y: Int): Int  {
        var i=1;
        var lcd=1;
        while (i<=x && i<=y) {
            if(x % i == 0 && y % i ==0)
            {
                lcd = i

            }
            i++
        }
        return lcd
    }

    fun leastCommonMultiple(x: Int, y: Int): Int
    {

        var lcm = if(x>y) x else y

        while(true){
            if (lcm % x == 0 && lcm % y == 0) {
                break
            }
            lcm++
        }
        return lcm

    }

    fun checkString(a: String): String{
        if (a.contains('$'))
            return "Yes, String contains $"
        else return "No, String does not contain $"
    }

    //pass 100 as parameter
    fun recursiveCalculate(n: Int): Int {

        if (n == 0) return 0
        var sum = recursiveCalculate(n - 1)
        if (n % 2 == 0) sum += n
        return sum
    }

    fun convertToNumber(number: String): Int {
        return  number.reversed().toInt()
    }


    fun checkPalindromeString(a: String): String {
        val temp = StringBuilder(a)


        val reversed = temp.reverse().toString()


        return if (a.equals(reversed, ignoreCase = true)) "Input string is Palindrome"
        else "Input string is not Palindrome"
    }

}

fun main()
{

}






