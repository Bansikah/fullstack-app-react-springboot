import React from 'react'
import { useState } from 'react'
// import './SignUp.css'

import { Box, Typography, TextField, Button } from '@mui/material'
const SignUp = () => {

  const [formData, setFormData] = useState ([
    {
      name: '',
      email: '',
      password: ''
    }
  ]);

  const onchangeInput = (e) => {
     setFormData(() =>({
      ...formData, [e.target.value]: e.target.value
     }))
   };


  return (
    <Box sx={{

        display: 'flex',
        justifyContent: 'center',
        flexDirection: 'column',
        alignItems: 'center',
        marginTop: 5,


    }}>
      <Box>
         <Typography variant='h2'
            sx={{
                 fontWeight: 'bold',
                 opacity: 0.5,
                 mb: 10  }} >   Sign Up </Typography>
     </Box>
         <Box sx={{
                    display: 'flex',
                    flexDirection: 'column',
                    width: '50%', }}>
                    
                     <TextField onChange={onchangeInput} type={'text'}  label="Name" variant="outlined" width = '200px' fullWidth={true} />
                     
                     <TextField type={'email'} onChange={onchangeInput}   label="Email" variant="outlined" width = '200px' fullWidth={true} mb = '20' sx={{mt:5}} />
                     <TextField type="number" onChange={onchangeInput}   label="Number" variant="outlined" width = '200px' fullWidth={true} mb = '20' sx={{mt:5}}/>

                                
                            </Box>

                <Button variant="contained" color="primary" onClick={() => console.log(formData)}  sx={{
                    width: '200px',
                    mt: 5,
                    mb: 10,
                }} >
                    
                   <Typography variant='h5' sx={{ fontWeight: 'bold' }}> Sign Up</Typography> </Button>
   
    </Box>

       
    
  )
}

export default SignUp;