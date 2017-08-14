hrs = input("Enter Hours:")
rate = input("Enter Rate:")
try:
    h = float(hrs)
    r = float(rate)
except:
    print('Enter Numeric Input')
    quit()
if h <= 40:
    pay = h * r
else:
    pay = (40 + (h - 40) * 1.5) * r

print(pay)
