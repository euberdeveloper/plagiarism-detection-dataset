import math

# Get user input
weight_lbs = float(input("Enter weight in pounds: "))
feet = float(input("Enter feet: "))
inches = float(input("Enter inches: "))

# Calculate height in meters
height_m = (feet * 12 + inches) * 0.0254

# Calculate BMI
weight_kg = weight_lbs * 0.45359237
bmi = weight_kg / (height_m ** 2)

# Print BMI and classification
print(f"BMI is {bmi:.2f}")
if bmi < 18.5:
    print("underweight")
elif bmi >= 18.5 and bmi < 25:
    print("normal")
elif bmi >= 25 and bmi < 35:
    print("overweight")
else:
    print("obese")

