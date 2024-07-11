import math

weights = 0.0
feets = 0.0
inches = 0.0
heights = 0.0
bmi = 0.0

def main():
    global weights, feets, inches, heights, bmi
    
    # Prompt the user to enter weight in pounds
    weights = float(input("Enter weight in pounds: "))
    
    # Prompt the user to enter height
    feets = float(input("Enter feet: "))
    inches = float(input("Enter inches: "))
    
    # Compute BMI
    heights = feets * 12 + inches
    bmi = weights * 0.45359237 / ((heights * 0.0254) * (heights * 0.0254))
    cetak()

def cetak():
    global bmi
    
    # Display result
    print("BMI is", bmi)
    if bmi >= 30:
        print("Obese")
    elif bmi >= 25:
        print("Overweight")
    elif bmi >= 18.5:
        print("Normal")
    else:
        print("Underweight")

if __name__ == "__main__":
    main()

