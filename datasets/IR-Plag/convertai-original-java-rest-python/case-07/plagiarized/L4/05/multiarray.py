import numpy as np

def sum(m):
    """
    Adds up all the elements on the main diagonal of the given 2D array.
    
    Args:
        m (numpy.ndarray): A 2D array.
        
    Returns:
        float: The sum of the elements on the main diagonal.
    """
    return np.sum(np.diag(m))

def main():
    print("Enter a 4 by 4 matrix row by row:")
    ma = np.array([input().split() for _ in range(4)], dtype=float)
    
    diagonal_sum = sum(ma)
    print(f"Sum of the elements in the major diagonal is {diagonal_sum}")

if __name__ == "__main__":
    main()

