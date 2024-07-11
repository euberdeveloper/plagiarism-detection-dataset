import sys

def sumMajorDiagonal(m):
    """
    Calculates the sum of the elements in the major diagonal of a 2D matrix.
    
    Args:
        m (list of lists): A 2D matrix represented as a list of lists.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    sum = 0
    for i in range(len(m)):
        sum += m[i][i]
    return sum

if __name__ == "__main__":
    print("Enter a 4 by 4 matrix row by row: ", end="")
    m = []
    for i in range(4):
        row = [float(x) for x in input().split()]
        m.append(row)
    
    print(f"Sum of the elements in the major diagonal is {sumMajorDiagonal(m)}")

