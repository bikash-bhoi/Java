import re
line = 'How 2 train your dragon 4 war against a 300 spartans'
y = re.findall('[0-9]+', line)
print(y)

line = 'From: that email: doesnt exist'
greedy = re.findall('F.+:',line)
print(greedy)
nongreedy=re.findall('F.+?:',line)
print(nongreedy)

line = 'From cwen@iupui.edu Thu Jan  3 16:23:48 2008'
mail = re.findall('\S+@\S+',line)
print(mail)

# Extract using parentheses
mail = re.findall('^From (\S+@\S+)',line)
print(mail)

domain = re.findall('@([^ ]*)',line)
print(domain)

domain = re.findall('^From .*@(\S+)',line)
print(domain)

#Escape character
line = 'Cost of this is $200.42'
money = re.findall('\$\S+',line)
print(money)