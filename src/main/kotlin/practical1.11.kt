fun main()
{
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), 2, 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), 3, 2)
    val thirdMatrix =  Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), 3, 2)

    println("*****Addition*****")
    println("Matrix:1 ")
    print(thirdMatrix)
    println("Matrix:2 ")
    print(secondMatrix)
    val additionResult = thirdMatrix + secondMatrix
    println("Addition: \n$additionResult")

    println("*****Subtraction*****")
    println("Matrix:1 ")
    print(thirdMatrix)
    println("Matrix:2 ")
    print(secondMatrix)
    val subtractionResult = thirdMatrix - secondMatrix
    println("Subtraction: \n$subtractionResult")

    println("*****Multiplication*****")
    println("Matrix:1 ")
    print(firstMatrix)
    println("Matrix:2 ")
    print(secondMatrix)
    val multiplicationResult = firstMatrix * secondMatrix
    println("Multiplication: \n$multiplicationResult")
}

class Matrix(private val matrixData: Array<IntArray>, private val rows: Int, private val cols: Int) {
    // Overloading plus operator for matrix addition
    operator fun plus(other: Matrix): Matrix {
        if (rows != other.rows || cols != other.cols) {
            throw IllegalArgumentException("Matrix dimensions don't match for addition.")
        }

        val resultMatrix = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultMatrix[i][j] = matrixData[i][j] + other.matrixData[i][j]
            }
        }
        return Matrix(resultMatrix, rows, cols)
    }

    // Overloading minus operator for matrix subtraction
    operator fun minus(other: Matrix): Matrix {
        if (rows != other.rows || cols != other.cols) {
            throw IllegalArgumentException("Matrix dimensions don't match for subtraction.")
        }

        val resultMatrix = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                resultMatrix[i][j] = matrixData[i][j] - other.matrixData[i][j]
            }
        }
        return Matrix(resultMatrix, rows, cols)
    }

    // Overloading times operator for matrix multiplication
    operator fun times(other: Matrix): Matrix {
        if (cols != other.rows) {
            throw IllegalArgumentException("Matrix dimensions don't match for multiplication.")
        }

        val resultMatrix = Array(rows) { IntArray(other.cols) }
        for (i in 0 until rows) {
            for (j in 0 until other.cols) {
                var sum = 0
                for (k in 0 until cols) {
                    sum += matrixData[i][k] * other.matrixData[k][j]
                }
                resultMatrix[i][j] = sum
            }
        }
        return Matrix(resultMatrix, rows, other.cols)
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                sb.append(matrixData[i][j]).append(" ")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
}