s = input()

i = 0
res = ''

while i < len(s):
    res += s[i]
    if (i != len(s)-1) and (s[i] == s[i+1]):
        i += 1
    i += 1

print(res)

