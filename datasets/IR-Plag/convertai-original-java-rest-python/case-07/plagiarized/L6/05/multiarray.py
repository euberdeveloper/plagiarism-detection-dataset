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
    ma = np.zeros((4, 4))
    for i in range(4):
        for j in range(4):
            ma[3-i, 3-j] = float(input())
    
    sum_diag = sum(ma)
    print(f"Sum of the elements in the major diagonal is {sum_diag}")

if __name__ == "__main__":
    main()

