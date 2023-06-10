def minion_game(s):
    vow = 0
    con = 0
    for i in range(len(s)):
        if s[i] in 'AEIOU':
            vow = vow +(len(s)-i)
        else:
            con = con +(len(s)-i)   
    if vow > con:
        print("Stuart",s1)
    elif con > vow:
        print("Kevin",s2)
    else:
        print("Draw")    
if __name__ == '__main__':
    s = input()
    minion_game(s)
