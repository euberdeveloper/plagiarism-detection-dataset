import math

def calculate_bmi(weight, height):
    bmi = weight * 0.45359237 / (math.pow(height * 0.0254, 2))
    return bmi

def main():
    input_data = input("Enter weight in pounds: ")
    weight = float(input_data)
    input_data = input("Enter feet: ")
    feet = float(input_data)
    input_data = input("Enter inches: ")
    inches = float(input_data)
    height = feet * 12 + inches
    bmi = calculate_bmi(weight, height)
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
    main()

