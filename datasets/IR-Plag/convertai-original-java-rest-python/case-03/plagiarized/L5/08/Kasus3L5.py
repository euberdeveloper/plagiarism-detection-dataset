import math

def calculate_bmi(weight, height):
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

def bmi_category(bmi):
    print(f"BMI is {bmi:.2f}")
    if bmi < 18.5:
        print("Underweight")
    elif bmi < 25:
        print("Normal")
    elif bmi < 30:
        print("Overweight")
    else:
        print("Obese")

if __name__ == "__main__":
    print("Enter weight in pounds: ", end="")
    weight = float(input())

    print("Enter feet: ", end="")
    feet = float(input())
    print("Enter inches: ", end="")
    inches = float(input())

    height = (feet * 12) + inches
    bmi = calculate_bmi(weight, height)
    bmi_category(bmi)

