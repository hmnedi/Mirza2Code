n, m = input(), input()

res = m
for i in n:
    for j in m:
       if int(i)%int(j) == 0:
           res = res.replace(j, '')

if res == '':
    print("OPEN")
else:
    print('LOCKED')
