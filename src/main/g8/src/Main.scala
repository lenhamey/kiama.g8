import org.kiama.util.ParsingREPL

/**
 * A top-level read-eval-print loop.  Reads a simple arithmetic expression
 * and prints it, its value and variants.  E.g.
 *
 * exp> 0 + 4 * 1  
 * e = Add(Num(0),Mul(Num(4),Num(1)))
 * e tree:
 * Add (Num (0), Mul (Num (4), Num (1)))
 * e tree pretty printed:
 * (0 + (4 * 1))
 * value (e) = 4
 * e optimised = Num(4)
 * value (e optimised) = 4
 */
object Main extends ParsingREPL[Exp] with Parser {

    import Evaluator.value
    import PrettyPrinter.{pretty, product}
    import Optimiser.optimise

    override def setup (args : Array[String]) : Boolean = {
        println ("Enter expressions using numbers, addition and multiplication.")
        println (" e.g., (1 + 2) * 3 or 0 + 4 * 1")
        true
    }

    override def prompt () = "exp> "

    /**
     * Print the expression as a value, as a tree, pretty printed.
     * Print its value. Optimise it and then print the optimised
     * expression and its value.
     */
    def process (e : Exp) {
        println ("e = " + e)
        println ("e tree:")
        println (pretty (product (e)))
        println ("e tree pretty printed:")
        println (pretty (e))
        println ("value (e) = " + value (e))
        val o = optimise (e)
        println ("e optimised = " + o)
        println ("value (e optimised) = " + value (o))
    }

}