import math

def calculate_bmi(weight_lbs, height_ft, height_in):
    weight_kg = weight_lbs * 0.45359237
    height_m = (height_ft * 12 + height_in) * 0.0254
    bmi = weight_kg / (height_m ** 2)
    return bmi

def main():
    weight_lbs = float(input("Enter weight in pounds: "))
    height_ft = float(input("Enter feet: "))
    height_in = float(input("Enter inches: "))
    bmi = calculate_bmi(weight_lbs, height_ft, height_in)
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

