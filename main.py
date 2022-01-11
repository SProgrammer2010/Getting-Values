# This python code gets First, Middle, and the Last Value of a list.

Values = ["Tesla", "Porsche", "Ferrari", "Lamborghini", "Chevrolet"]
fun = round(len(Values) / 2)

print("This is the number of cars: ",len(Values))
print("This is the First car: ",Values[len(Values)-len(Values)])
print("This is the middle car: ",Values[fun])
print("This is the last car: ",Values[len(Values)-1])