import math

def hit_bmi(weight, height):
    return weight * 0.45359237 / ((height * 0.0254) * (height * 0.0254))

def main():
    weight = float(input("Enter weight in pounds: "))
    feet = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    height = feet * 12 + inches

    bmi = hit_bmi(weight, height)
    print(f"BMI is {bmi:.2f}")

    if 18.5 <= bmi < 25:
        print("Normal")
    elif 25 <= bmi < 30:
        print("Overweight")
    elif bmi >= 30:
        print("Obese")
    else:
        print("Underweight")

if __name__ == "__main__":
    main()

