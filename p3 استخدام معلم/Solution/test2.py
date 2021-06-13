a, b= input(), input()
cnt = 0

for i in range(97, 123):
        letter = chr(i)
        if (letter in a) and (letter in b):
                cnt += 1

print(cnt)
