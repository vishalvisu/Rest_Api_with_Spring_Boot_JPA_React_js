import React from 'react';
import { Form, FormGroup, Button } from 'reactstrap';

export function Update_course()
{

return(
    <>
    <h1>Update--COURSE</h1>
     <Form>
   <FormGroup>
   <label for="user_ID">Enter Course_id</label>
   <input type="text" id="user_ID" name="user_ID" placeholder="enter id"/>
   </FormGroup>

   <FormGroup>
   <label for="title">Enter Title</label>
   <input type="text" id="title" name="title" placeholder="enter title"/>
   </FormGroup>

   <FormGroup>
   <label for="desc">Enter Description</label>
   <input type="text" id="desc" name="desc" placeholder="enter Description"/>
   </FormGroup>

     <FormGroup>
   <Button  id="submit" name="submit"> Update--COURSE</Button>
   </FormGroup>
   </Form>
    </>
)


}