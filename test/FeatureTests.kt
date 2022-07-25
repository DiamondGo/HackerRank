import org.junit.Assert
import org.junit.Test

class FeatureTests {
    @Test fun testDivide() {
        Assert.assertTrue(7.toDouble() / 3.toDouble() > 2)
    }

    @Test fun testMapMiss() {
        val m: Map<Int, List<Int>> = mapOf(1 to listOf(1, 2), 2 to listOf(3, 4))
        println(m[3]?.size?.toFloat() ?: .0 / m.size.toFloat())
    }

    @Test fun testStrRepeat() {
        println("1".repeat(3))
    }
}