import sys

def main():
    print("Enter weight in pounds: ", end="")
    weight = int(input())
    print("Enter feet: ", end="")
    feet = int(input())
    print("Enter inch: ", end="")
    inches = int(input())
    height = feet * 12 + inches
    bmi = weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))
    print(f"BMI is {bmi:.2f}")
    if bmi < 18.5:
        print("underweight")
    elif 18.5 <= bmi < 25:
        print("Normal")
    elif 25 <= bmi < 35:
        print("overweight")
    elif bmi > 35:
        print("obese")

if __name__ == "__main__":
    main()

