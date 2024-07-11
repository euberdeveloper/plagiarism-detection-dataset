import math

def main():
    w = float(input("Enter weight in pounds: "))
    f = float(input("Enter feet: "))
    i = float(input("Enter inches: "))
    h = f * 12 + i  # calculate height
    total_bmi = hit_bmi(w, h)  # calculate BMI
    # display results
    print("BMI is", total_bmi)
    result(total_bmi)

def hit_bmi(w, h):
    return (w * 0.45359237) / ((h * 0.0254) * (h * 0.0254))

def result(total_bmi):
    if total_bmi > 30:
        print("Obese")
    elif total_bmi < 25 and total_bmi > 18.5:
        print("Normal")
    elif total_bmi > 25 and total_bmi < 30:
        print("Overweight")
    else:
        print("Underweight")

if __name__ == "__main__":
    main()

