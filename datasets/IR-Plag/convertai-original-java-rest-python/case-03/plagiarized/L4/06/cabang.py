import math

def main():
    weight = float(input("Enter weight in pounds: "))
    feet = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    height = feet * 12 + inches
    total_bmi = calculate_bmi(weight, height)
    print("BMI is", total_bmi)
    display_result(total_bmi)

def calculate_bmi(weight, height):
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

def display_result(total_bmi):
    if total_bmi < 18.5:
        print("Underweight")
    elif total_bmi < 25:
        print("Normal")
    elif total_bmi < 30:
        print("Overweight")
    else:
        print("Obese")

if __name__ == "__main__":
    main()

