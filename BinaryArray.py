nums=[1, 1, 1, 1, 1, 1,0,1,1]
count=0
maxCount=0

i=0
while i<len(nums):
    if nums[i]!=1:
        count=0
    if maxCount<count:
        maxCount=count
    if nums[i]==0:
        count=0
    i+=1
print(maxCount)