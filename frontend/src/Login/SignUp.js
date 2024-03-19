import React from 'react'
// import './SignUp.css'

import { Box, Typography, TextField, Button } from '@mui/material'
const SignUp = () => {
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
                    
                     <TextField id="outlined-basic" label="Name" variant="outlined" width = '200px' fullWidth={true} />
                     
                     <TextField id="outlined-basic" label="Email" variant="outlined" width = '200px' fullWidth={true} mb = '20' sx={{mt:5}} />
                     <TextField id="outlined-basic" label="Number" variant="outlined" width = '200px' fullWidth={true} mb = '20' sx={{mt:5}}/>

                                
                            </Box>

                <Button variant="contained" color="primary" sx={{
                    width: '200px',
                    mt: 5,
                    mb: 10,
                }} >
                    
                   <Typography variant='h5' sx={{ fontWeight: 'bold' }}> Sign Up</Typography> </Button>
   
    </Box>

       
    
  )
}

export default SignUp;