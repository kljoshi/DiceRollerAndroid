# DiceRollerAndroid

## Lesson 1: Build your First App: 
This is the first android project in [Udacity: Developing Android Apps with Kotlin course.](https://classroom.udacity.com/courses/ud9012)
- Explains the basics of creating a simple app.
- Activity file
- XML file
- widgets 


## Highlight from lession 1:
### How to reduce app size on older platforms?
Vector drawable is supported in API Verson 21 and onwards, so any API version below 21 will use png image instead of XML which will increase the size of the app. So by using:
```
// build.gradle file (app level)
vectorDrawables.useSupportLibrary = true

// use app:srcCompat in the image tag in the layout file
app:srcCompat="@drawable/image_name"
```
We can reduce the size of our app. 
