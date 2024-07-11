import numpy as np

def sum_major_diagonal(m):
    """
    Function to calculate the sum of the elements in the major diagonal of a matrix.
    
    Args:
        m (numpy.ndarray): A 4x4 matrix.
    
    Returns:
        float: The sum of the elements in the major diagonal.
    """
    return np.trace(m)

if __name__ == "__main__":
    # Get input matrix from the user
    print("Enter a 4 by 4 matrix row by row:")
    m = np.array([list(map(float, input().split())) for _ in range(4)])
    
    # Calculate and print the sum of the major diagonal
    print(f"Sum of the elements in the major diagonal is {sum_major_diagonal(m)}")

