val b10=findViewById<Button>(R.id.LogButton)

        b10.setOnClickListener{
            Log.d("Debug Error","This is a debug message")
            Log.e("Error","This is an error message")
            Log.w("Warning","This a warning error")
            Log.v("Verbose","This is a Verbose error")
            Log.i("Information","This is an information log")
        }
