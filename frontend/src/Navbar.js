import React, { Component } from 'react'
function Navigation() {
    const [collapsed, setCollapse] = useState(false);
  
      return (
        <Navbar className="navbar navbar-expand-lg navbar-dark" light expand="md" sticky="top">
          <NavbarBrand href="/">Home</NavbarBrand>
          <NavbarToggler onClick={changeCollapse} className="ml-auto" />
          <Collapse isOpen={collapsed} navbar>
          <Nav className='mr-auto' navbar>
              <NavItem>
                  <NavLink href="/about" className="active">About</NavLink>
              </NavItem>
            </Nav> 
          </Collapse>
        </Navbar>
      )
      }